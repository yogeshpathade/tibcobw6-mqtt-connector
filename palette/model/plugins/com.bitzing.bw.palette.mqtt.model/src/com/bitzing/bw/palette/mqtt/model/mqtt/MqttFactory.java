/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage
 * @generated
 */
public interface MqttFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MqttFactory eINSTANCE = com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttFactoryImpl.init();

  /**
   * Returns a new object of class '<em>MQTT Publish Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MQTT Publish Activity</em>'.
   * @generated
   */
  MQTTPublishActivity createMQTTPublishActivity();

  /**
   * Returns a new object of class '<em>MQTT Message Subscriber</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MQTT Message Subscriber</em>'.
   * @generated
   */
  MQTTMessageSubscriber createMQTTMessageSubscriber();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MqttPackage getMqttPackage();

} //MqttFactory
