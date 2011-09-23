/**
 * <copyright>
 * </copyright>
 *
 */
package com.soluvas.glproto.glproto.impl;

import com.soluvas.glproto.glproto.File;
import com.soluvas.glproto.glproto.GlprotoFactory;
import com.soluvas.glproto.glproto.GlprotoPackage;
import com.soluvas.glproto.glproto.Model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlprotoFactoryImpl extends EFactoryImpl implements GlprotoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GlprotoFactory init()
  {
    try
    {
      GlprotoFactory theGlprotoFactory = (GlprotoFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.soluvas.com/glproto/Glproto"); 
      if (theGlprotoFactory != null)
      {
        return theGlprotoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GlprotoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlprotoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GlprotoPackage.MODEL: return createModel();
      case GlprotoPackage.PACKAGE: return createPackage();
      case GlprotoPackage.FILE: return createFile();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.soluvas.glproto.glproto.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlprotoPackage getGlprotoPackage()
  {
    return (GlprotoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GlprotoPackage getPackage()
  {
    return GlprotoPackage.eINSTANCE;
  }

} //GlprotoFactoryImpl
