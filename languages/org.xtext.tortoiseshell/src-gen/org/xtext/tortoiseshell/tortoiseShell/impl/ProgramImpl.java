/**
 */
package org.xtext.tortoiseshell.tortoiseShell.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.tortoiseshell.tortoiseShell.Program;
import org.xtext.tortoiseshell.tortoiseShell.SubProgram;
import org.xtext.tortoiseshell.tortoiseShell.TortoiseShellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tortoiseshell.tortoiseShell.impl.ProgramImpl#getSubPrograms <em>Sub Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends ExecutableImpl implements Program
{
  /**
   * The cached value of the '{@link #getSubPrograms() <em>Sub Programs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPrograms()
   * @generated
   * @ordered
   */
  protected EList<SubProgram> subPrograms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProgramImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TortoiseShellPackage.Literals.PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubProgram> getSubPrograms()
  {
    if (subPrograms == null)
    {
      subPrograms = new EObjectContainmentEList<SubProgram>(SubProgram.class, this, TortoiseShellPackage.PROGRAM__SUB_PROGRAMS);
    }
    return subPrograms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__SUB_PROGRAMS:
        return ((InternalEList<?>)getSubPrograms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__SUB_PROGRAMS:
        return getSubPrograms();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__SUB_PROGRAMS:
        getSubPrograms().clear();
        getSubPrograms().addAll((Collection<? extends SubProgram>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__SUB_PROGRAMS:
        getSubPrograms().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TortoiseShellPackage.PROGRAM__SUB_PROGRAMS:
        return subPrograms != null && !subPrograms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProgramImpl
