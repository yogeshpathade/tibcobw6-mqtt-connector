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
 * A representation of the model object '<em><b>MQTT Publish Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getServerURI <em>Server URI</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getClientID <em>Client ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTPublishActivity()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD Editor' schemaFile='/home/yogesh/work/bw6-workspace/MQTT/palette/design/plugins/com.bitzing.bw.palette.mqtt.design/schema/MQTTPublishActivitySchema.xsd' inputelementname='MQTTPublishActivityInput' outputelementname='' faultelementname='MQTTPublishActivityFault' helpdocuuid='27cb0b9b-a3bf-4abf-be44-e6629e0be180'"
 * @generated
 */
public interface MQTTPublishActivity extends EObject
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
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTPublishActivity_ServerURI()
   * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Server URI' isModelProperty='true' control='TextBox' value=''"
   * @generated
   */
  String getServerURI();

  /**
   * Sets the value of the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getServerURI <em>Server URI</em>}' attribute.
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
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#getMQTTPublishActivity_ClientID()
   * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Client ID' isModelProperty='true' control='TextBox' value=''"
   * @generated
   */
  String getClientID();

  /**
   * Sets the value of the '{@link com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity#getClientID <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client ID</em>' attribute.
   * @see #getClientID()
   * @generated
   */
  void setClientID(String value);

} // MQTTPublishActivity
