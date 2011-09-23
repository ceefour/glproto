/**
 * <copyright>
 * </copyright>
 *
 */
package com.soluvas.glproto.glproto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.soluvas.glproto.glproto.Package#getName <em>Name</em>}</li>
 *   <li>{@link com.soluvas.glproto.glproto.Package#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.soluvas.glproto.glproto.GlprotoPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.soluvas.glproto.glproto.GlprotoPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.soluvas.glproto.glproto.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Files</b></em>' containment reference list.
   * The list contents are of type {@link com.soluvas.glproto.glproto.File}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Files</em>' containment reference list.
   * @see com.soluvas.glproto.glproto.GlprotoPackage#getPackage_Files()
   * @model containment="true"
   * @generated
   */
  EList<File> getFiles();

} // Package
