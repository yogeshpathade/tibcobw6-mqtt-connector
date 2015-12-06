/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt.impl;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MQTT Publish Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl#getServerURI <em>Server URI</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTPublishActivityImpl#getClientID <em>Client ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQTTPublishActivityImpl extends EObjectImpl implements MQTTPublishActivity
{
  /**
   * The default value of the '{@link #getServerURI() <em>Server URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerURI()
   * @generated
   * @ordered
   */
  protected static final String SERVER_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServerURI() <em>Server URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerURI()
   * @generated
   * @ordered
   */
  protected String serverURI = SERVER_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientID()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientID()
   * @generated
   * @ordered
   */
  protected String clientID = CLIENT_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MQTTPublishActivityImpl()
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
    return MqttPackage.Literals.MQTT_PUBLISH_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServerURI()
  {
    return serverURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerURI(String newServerURI)
  {
    String oldServerURI = serverURI;
    serverURI = newServerURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.MQTT_PUBLISH_ACTIVITY__SERVER_URI, oldServerURI, serverURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientID()
  {
    return clientID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientID(String newClientID)
  {
    String oldClientID = clientID;
    clientID = newClientID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.MQTT_PUBLISH_ACTIVITY__CLIENT_ID, oldClientID, clientID));
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
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__SERVER_URI:
        return getServerURI();
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__CLIENT_ID:
        return getClientID();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__SERVER_URI:
        setServerURI((String)newValue);
        return;
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__CLIENT_ID:
        setClientID((String)newValue);
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
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__SERVER_URI:
        setServerURI(SERVER_URI_EDEFAULT);
        return;
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__CLIENT_ID:
        setClientID(CLIENT_ID_EDEFAULT);
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
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__SERVER_URI:
        return SERVER_URI_EDEFAULT == null ? serverURI != null : !SERVER_URI_EDEFAULT.equals(serverURI);
      case MqttPackage.MQTT_PUBLISH_ACTIVITY__CLIENT_ID:
        return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (serverURI: ");
    result.append(serverURI);
    result.append(", clientID: ");
    result.append(clientID);
    result.append(')');
    return result.toString();
  }

} //MQTTPublishActivityImpl
