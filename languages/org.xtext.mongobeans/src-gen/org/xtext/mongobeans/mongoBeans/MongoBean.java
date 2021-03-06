/**
 */
package org.xtext.mongobeans.mongoBeans;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mongobeans.mongoBeans.MongoBean#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.xtext.mongobeans.mongoBeans.MongoBeansPackage#getMongoBean()
 * @model
 * @generated
 */
public interface MongoBean extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.mongobeans.mongoBeans.AbstractFeature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.mongobeans.mongoBeans.MongoBeansPackage#getMongoBean_Features()
   * @model containment="true"
   * @generated
   */
  EList<AbstractFeature> getFeatures();

} // MongoBean
