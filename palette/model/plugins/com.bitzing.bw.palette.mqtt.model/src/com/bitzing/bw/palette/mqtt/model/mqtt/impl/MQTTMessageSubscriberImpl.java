/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt.impl;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MQTT Message Subscriber</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl#getServerURI <em>Server URI</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link com.bitzing.bw.palette.mqtt.model.mqtt.impl.MQTTMessageSubscriberImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MQTTMessageSubscriberImpl extends EObjectImpl implements MQTTMessageSubscriber
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
   * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected static final String TOPIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopic()
   * @generated
   * @ordered
   */
  protected String topic = TOPIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MQTTMessageSubscriberImpl()
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
    return MqttPackage.Literals.MQTT_MESSAGE_SUBSCRIBER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI, oldServerURI, serverURI));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID, oldClientID, clientID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTopic()
  {
    return topic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopic(String newTopic)
  {
    String oldTopic = topic;
    topic = newTopic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MqttPackage.MQTT_MESSAGE_SUBSCRIBER__TOPIC, oldTopic, topic));
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
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI:
        return getServerURI();
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID:
        return getClientID();
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__TOPIC:
        return getTopic();
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
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI:
        setServerURI((String)newValue);
        return;
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID:
        setClientID((String)newValue);
        return;
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__TOPIC:
        setTopic((String)newValue);
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
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI:
        setServerURI(SERVER_URI_EDEFAULT);
        return;
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID:
        setClientID(CLIENT_ID_EDEFAULT);
        return;
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__TOPIC:
        setTopic(TOPIC_EDEFAULT);
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
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__SERVER_URI:
        return SERVER_URI_EDEFAULT == null ? serverURI != null : !SERVER_URI_EDEFAULT.equals(serverURI);
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID:
        return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
      case MqttPackage.MQTT_MESSAGE_SUBSCRIBER__TOPIC:
        return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
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
    result.append(" (ServerURI: ");
    result.append(serverURI);
    result.append(", ClientID: ");
    result.append(clientID);
    result.append(", topic: ");
    result.append(topic);
    result.append(')');
    return result.toString();
  }

} //MQTTMessageSubscriberImpl
