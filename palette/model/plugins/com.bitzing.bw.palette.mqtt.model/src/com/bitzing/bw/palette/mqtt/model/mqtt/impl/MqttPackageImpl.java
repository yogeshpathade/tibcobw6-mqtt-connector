/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.bitzing.bw.palette.mqtt.model.mqtt.impl;

import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTMessageSubscriber;
import com.bitzing.bw.palette.mqtt.model.mqtt.MQTTPublishActivity;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttFactory;
import com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MqttPackageImpl extends EPackageImpl implements MqttPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mqttPublishActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mqttMessageSubscriberEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.bitzing.bw.palette.mqtt.model.mqtt.MqttPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MqttPackageImpl()
  {
    super(eNS_URI, MqttFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MqttPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MqttPackage init()
  {
    if (isInited) return (MqttPackage)EPackage.Registry.INSTANCE.getEPackage(MqttPackage.eNS_URI);

    // Obtain or create and register package
    MqttPackageImpl theMqttPackage = (MqttPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MqttPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MqttPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMqttPackage.createPackageContents();

    // Initialize created meta-data
    theMqttPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMqttPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MqttPackage.eNS_URI, theMqttPackage);
    return theMqttPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMQTTPublishActivity()
  {
    return mqttPublishActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTTPublishActivity_ServerURI()
  {
    return (EAttribute)mqttPublishActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTTPublishActivity_ClientID()
  {
    return (EAttribute)mqttPublishActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMQTTMessageSubscriber()
  {
    return mqttMessageSubscriberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTTMessageSubscriber_ServerURI()
  {
    return (EAttribute)mqttMessageSubscriberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTTMessageSubscriber_ClientID()
  {
    return (EAttribute)mqttMessageSubscriberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMQTTMessageSubscriber_Topic()
  {
    return (EAttribute)mqttMessageSubscriberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MqttFactory getMqttFactory()
  {
    return (MqttFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mqttPublishActivityEClass = createEClass(MQTT_PUBLISH_ACTIVITY);
    createEAttribute(mqttPublishActivityEClass, MQTT_PUBLISH_ACTIVITY__SERVER_URI);
    createEAttribute(mqttPublishActivityEClass, MQTT_PUBLISH_ACTIVITY__CLIENT_ID);

    mqttMessageSubscriberEClass = createEClass(MQTT_MESSAGE_SUBSCRIBER);
    createEAttribute(mqttMessageSubscriberEClass, MQTT_MESSAGE_SUBSCRIBER__SERVER_URI);
    createEAttribute(mqttMessageSubscriberEClass, MQTT_MESSAGE_SUBSCRIBER__CLIENT_ID);
    createEAttribute(mqttMessageSubscriberEClass, MQTT_MESSAGE_SUBSCRIBER__TOPIC);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mqttPublishActivityEClass, MQTTPublishActivity.class, "MQTTPublishActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMQTTPublishActivity_ServerURI(), ecorePackage.getEString(), "serverURI", null, 0, 1, MQTTPublishActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMQTTPublishActivity_ClientID(), ecorePackage.getEString(), "clientID", null, 0, 1, MQTTPublishActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mqttMessageSubscriberEClass, MQTTMessageSubscriber.class, "MQTTMessageSubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMQTTMessageSubscriber_ServerURI(), ecorePackage.getEString(), "ServerURI", null, 0, 1, MQTTMessageSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMQTTMessageSubscriber_ClientID(), ecorePackage.getEString(), "ClientID", null, 0, 1, MQTTMessageSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMQTTMessageSubscriber_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, MQTTMessageSubscriber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // dkactivityconfig
    createDkactivityconfigAnnotations();
    // dkcontrolconfig
    createDkcontrolconfigAnnotations();
  }

  /**
   * Initializes the annotations for <b>dkactivityconfig</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDkactivityconfigAnnotations()
  {
    String source = "dkactivityconfig";		
    addAnnotation
      (mqttPublishActivityEClass, 
       source, 
       new String[] 
       {
       "activitytype", "Synchronous",
       "schemaType", "XSD Editor",
       "schemaFile", "/home/yogesh/work/bw6-workspace/MQTT/palette/design/plugins/com.bitzing.bw.palette.mqtt.design/schema/MQTTPublishActivitySchema.xsd",
       "inputelementname", "MQTTPublishActivityInput",
       "outputelementname", "",
       "faultelementname", "MQTTPublishActivityFault",
       "helpdocuuid", "27cb0b9b-a3bf-4abf-be44-e6629e0be180"
       });				
    addAnnotation
      (mqttMessageSubscriberEClass, 
       source, 
       new String[] 
       {
       "activitytype", "Process Starter",
       "schemaType", "XSD Editor",
       "schemaFile", "/home/yogesh/work/bw6-workspace/MQTT/palette/design/plugins/com.bitzing.bw.palette.mqtt.design/schema/MQTTMessageSubscriberSchema.xsd",
       "inputelementname", "",
       "outputelementname", "MQTTMessageSubscriberOutput",
       "faultelementname", "",
       "helpdocuuid", "b7ee18d0-6c98-4ccd-b7da-6c9ec428089e"
       });			
  }

  /**
   * Initializes the annotations for <b>dkcontrolconfig</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDkcontrolconfigAnnotations()
  {
    String source = "dkcontrolconfig";			
    addAnnotation
      (getMQTTPublishActivity_ServerURI(), 
       source, 
       new String[] 
       {
       "sectionName", "General",
       "isRequired", "true",
       "label", "Server URI",
       "isModelProperty", "true",
       "control", "TextBox",
       "value", ""
       });		
    addAnnotation
      (getMQTTPublishActivity_ClientID(), 
       source, 
       new String[] 
       {
       "sectionName", "General",
       "isRequired", "true",
       "label", "Client ID",
       "isModelProperty", "true",
       "control", "TextBox",
       "value", ""
       });			
    addAnnotation
      (getMQTTMessageSubscriber_ServerURI(), 
       source, 
       new String[] 
       {
       "sectionName", "General",
       "isRequired", "true",
       "label", "ServerURI",
       "isModelProperty", "true",
       "control", "TextBox",
       "value", ""
       });		
    addAnnotation
      (getMQTTMessageSubscriber_ClientID(), 
       source, 
       new String[] 
       {
       "sectionName", "General",
       "isRequired", "true",
       "label", "clientID",
       "isModelProperty", "true",
       "control", "TextBox",
       "value", ""
       });		
    addAnnotation
      (getMQTTMessageSubscriber_Topic(), 
       source, 
       new String[] 
       {
       "sectionName", "General",
       "isRequired", "true",
       "label", "Topic",
       "isModelProperty", "true",
       "control", "TextBox",
       "value", ""
       });
  }

} //MqttPackageImpl
