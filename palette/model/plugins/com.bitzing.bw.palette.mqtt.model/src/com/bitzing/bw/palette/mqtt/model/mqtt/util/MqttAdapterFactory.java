/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt.util;

import com.bitzing.bw.palette.mqtt.model.mqtt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage
 * @generated
 */
public class MqttAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MqttPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqttAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MqttPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MqttSwitch<Adapter> modelSwitch =
    new MqttSwitch<Adapter>()
    {
      @Override
      public Adapter caseMQTTPublishActivity(MQTTPublishActivity object)
      {
        return createMQTTPublishActivityAdapter();
      }
      @Override
      public Adapter caseMQTTMessageSubscriber(MQTTMessageSubscriber object)
      {
        return createMQTTMessageSubscriberAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity <em>MQTT Publish Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity
   * @generated
   */
  public Adapter createMQTTPublishActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber <em>MQTT Message Subscriber</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber
   * @generated
   */
  public Adapter createMQTTMessageSubscriberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MqttAdapterFactory
