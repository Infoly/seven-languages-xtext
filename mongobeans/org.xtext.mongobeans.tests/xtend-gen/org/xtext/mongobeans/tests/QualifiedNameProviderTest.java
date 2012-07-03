package org.xtext.mongobeans.tests;

import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.mongobeans.MongoBeansInjectorProvider;
import org.xtext.mongobeans.mongoBeans.MongoBean;
import org.xtext.mongobeans.mongoBeans.MongoFile;

@RunWith(value = XtextRunner.class)
@InjectWith(value = MongoBeansInjectorProvider.class)
@SuppressWarnings("all")
public class QualifiedNameProviderTest {
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private ParseHelper<MongoFile> _parseHelper;
  
  @Test
  public void testQualifiedName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package pkg {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Foo {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Bar {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} bar");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      MongoFile _parse = this._parseHelper.parse(_builder);
      TreeIterator<EObject> _eAllContents = _parse.eAllContents();
      final Iterator<MongoBean> beans = Iterators.<MongoBean>filter(_eAllContents, MongoBean.class);
      QualifiedName _create = QualifiedName.create("pkg", "Foo");
      MongoBean _head = IteratorExtensions.<MongoBean>head(beans);
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(_head);
      Assert.assertEquals(_create, _fullyQualifiedName);
      QualifiedName _create_1 = QualifiedName.create("pkg", "Bar");
      MongoBean _last = IteratorExtensions.<MongoBean>last(beans);
      QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(_last);
      Assert.assertEquals(_create_1, _fullyQualifiedName_1);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
