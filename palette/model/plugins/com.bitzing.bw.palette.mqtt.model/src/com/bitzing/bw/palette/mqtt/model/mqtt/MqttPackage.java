/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttFactory
 * @model kind="package"
 * @generated
 */
public interface MqttPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mqtt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://ns.tibco.com/bw/palette/mqtt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mqtt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MqttPackage eINSTANCE = com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttPackageImpl.init();

  /**
   * The meta object id for the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl <em>MQTT Publish Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttPackageImpl#getMQTTPublishActivity()
   * @generated
   */
  int MQTT_PUBLISH_ACTIVITY = 0;

  /**
   * The feature id for the '<em><b>Server URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_PUBLISH_ACTIVITY__SERVER_URI = 0;

  /**
   * The feature id for the '<em><b>Client ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_PUBLISH_ACTIVITY__CLIENT_ID = 1;

  /**
   * The number of structural features of the '<em>MQTT Publish Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_PUBLISH_ACTIVITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl <em>MQTT Message Subscriber</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttPackageImpl#getMQTTMessageSubscriber()
   * @generated
   */
  int MQTT_MESSAGE_SUBSCRIBER = 1;

  /**
   * The feature id for the '<em><b>Server URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_MESSAGE_SUBSCRIBER__SERVER_URI = 0;

  /**
   * The feature id for the '<em><b>Client ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID = 1;

  /**
   * The feature id for the '<em><b>Topic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_MESSAGE_SUBSCRIBER__TOPIC = 2;

  /**
   * The number of structural features of the '<em>MQTT Message Subscriber</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MQTT_MESSAGE_SUBSCRIBER_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity <em>MQTT Publish Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MQTT Publish Activity</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity
   * @generated
   */
  EClass getMQTTPublishActivity();

  /**
   * Returns the meta object for the attribute '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getServerURI <em>Server URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server URI</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getServerURI()
   * @see #getMQTTPublishActivity()
   * @generated
   */
  EAttribute getMQTTPublishActivity_ServerURI();

  /**
   * Returns the meta object for the attribute '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getClientID <em>Client ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client ID</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getClientID()
   * @see #getMQTTPublishActivity()
   * @generated
   */
  EAttribute getMQTTPublishActivity_ClientID();

  /**
   * Returns the meta object for class '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber <em>MQTT Message Subscriber</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MQTT Message Subscriber</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber
   * @generated
   */
  EClass getMQTTMessageSubscriber();

  /**
   * Returns the meta object for the attribute '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getServerURI <em>Server URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server URI</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getServerURI()
   * @see #getMQTTMessageSubscriber()
   * @generated
   */
  EAttribute getMQTTMessageSubscriber_ServerURI();

  /**
   * Returns the meta object for the attribute '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getClientID <em>Client ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client ID</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getClientID()
   * @see #getMQTTMessageSubscriber()
   * @generated
   */
  EAttribute getMQTTMessageSubscriber_ClientID();

  /**
   * Returns the meta object for the attribute '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getTopic <em>Topic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Topic</em>'.
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getTopic()
   * @see #getMQTTMessageSubscriber()
   * @generated
   */
  EAttribute getMQTTMessageSubscriber_Topic();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MqttFactory getMqttFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl <em>MQTT Publish Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl
     * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttPackageImpl#getMQTTPublishActivity()
     * @generated
     */
    EClass MQTT_PUBLISH_ACTIVITY = eINSTANCE.getMQTTPublishActivity();

    /**
     * The meta object literal for the '<em><b>Server URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQTT_PUBLISH_ACTIVITY__SERVER_URI = eINSTANCE.getMQTTPublishActivity_ServerURI();

    /**
     * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQTT_PUBLISH_ACTIVITY__CLIENT_ID = eINSTANCE.getMQTTPublishActivity_ClientID();

    /**
     * The meta object literal for the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl <em>MQTT Message Subscriber</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl
     * @see com.bitzing.bw.palette.mqtt.model.mqtt.impl.MqttPackageImpl#getMQTTMessageSubscriber()
     * @generated
     */
    EClass MQTT_MESSAGE_SUBSCRIBER = eINSTANCE.getMQTTMessageSubscriber();

    /**
     * The meta object literal for the '<em><b>Server URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQTT_MESSAGE_SUBSCRIBER__SERVER_URI = eINSTANCE.getMQTTMessageSubscriber_ServerURI();

    /**
     * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID = eINSTANCE.getMQTTMessageSubscriber_ClientID();

    /**
     * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MQTT_MESSAGE_SUBSCRIBER__TOPIC = eINSTANCE.getMQTTMessageSubscriber_Topic();

  }

} //MqttPackage
