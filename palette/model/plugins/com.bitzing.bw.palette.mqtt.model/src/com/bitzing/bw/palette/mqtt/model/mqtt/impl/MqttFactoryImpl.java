/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt.impl;

import com.bitzing.bw.palette.mqtt.model.mqtt.*;

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
public class MqttFactoryImpl extends EFactoryImpl implements MqttFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MqttFactory init()
  {
    try
    {
      MqttFactory theMqttFactory = (MqttFactory)EPackage.Registry.INSTANCE.getEFactory("http://ns.tibco.com/bw/palette/mqtt"); 
      if (theMqttFactory != null)
      {
        return theMqttFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MqttFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqttFactoryImpl()
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
      case MqttPackage.MQTT_PUBLISH_ACTIVITY: return createMQTTPublishActivity();
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER: return createMQTTMessageSubscriber();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MQTTPublishActivity createMQTTPublishActivity()
  {
    MQTTPublishActivityImpl mqttPublishActivity = new MQTTPublishActivityImpl();
    return mqttPublishActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MQTTMessageSubscriber createMQTTMessageSubscriber()
  {
    MQTTMessageSubscriberImpl mqttMessageSubscriber = new MQTTMessageSubscriberImpl();
    return mqttMessageSubscriber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqttPackage getMqttPackage()
  {
    return (MqttPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MqttPackage getPackage()
  {
    return MqttPackage.eINSTANCE;
  }

} //MqttFactoryImpl
