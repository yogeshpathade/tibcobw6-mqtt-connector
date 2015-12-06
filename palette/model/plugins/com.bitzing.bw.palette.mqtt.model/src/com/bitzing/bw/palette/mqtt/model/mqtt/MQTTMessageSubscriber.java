/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MQTT Message Subscriber</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getServerURI <em>Server URI</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getClientID <em>Client ID</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTMessageSubscriber()
 * @model annotation="dkactivityconfig activitytype='Process Starter' schemaType='XSD Editor' schemaFile='/home/yogesh/work/bw6-workspace/MQTT/palette/design/plugins/com.bitzing.bw.palette.mqtt.design/schema/MQTTMessageSubscriberSchema.xsd' inputelementname='' outputelementname='MQTTMessageSubscriberOutput' faultelementname='' helpdocuuid='b7ee18d0-6c98-4ccd-b7da-6c9ec428089e'"
 * @generated
 */
public interface MQTTMessageSubscriber extends EObject
{
  /**
   * Returns the value of the '<em><b>Server URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server URI</em>' attribute.
   * @see #setServerURI(String)
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTMessageSubscriber_ServerURI()
   * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='ServerURI' isModelProperty='true' control='TextBox' value=''"
   * @generated
   */
  String getServerURI();

  /**
   * Sets the value of the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getServerURI <em>Server URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server URI</em>' attribute.
   * @see #getServerURI()
   * @generated
   */
  void setServerURI(String value);

  /**
   * Returns the value of the '<em><b>Client ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client ID</em>' attribute.
   * @see #setClientID(String)
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTMessageSubscriber_ClientID()
   * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='clientID' isModelProperty='true' control='TextBox' value=''"
   * @generated
   */
  String getClientID();

  /**
   * Sets the value of the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getClientID <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client ID</em>' attribute.
   * @see #getClientID()
   * @generated
   */
  void setClientID(String value);

  /**
   * Returns the value of the '<em><b>Topic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' attribute.
   * @see #setTopic(String)
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTMessageSubscriber_Topic()
   * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Topic' isModelProperty='true' control='TextBox' value=''"
   * @generated
   */
  String getTopic();

  /**
   * Sets the value of the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber#getTopic <em>Topic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' attribute.
   * @see #getTopic()
   * @generated
   */
  void setTopic(String value);

} // MQTTMessageSubscriber
