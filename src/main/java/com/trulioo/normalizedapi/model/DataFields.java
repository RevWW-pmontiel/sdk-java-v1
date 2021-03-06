/*
 * OnlineID.NormalizedAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.trulioo.normalizedapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.trulioo.normalizedapi.model.Business;
import com.trulioo.normalizedapi.model.Communication;
import com.trulioo.normalizedapi.model.Document;
import com.trulioo.normalizedapi.model.DriverLicence;
import com.trulioo.normalizedapi.model.Location;
import com.trulioo.normalizedapi.model.NationalId;
import com.trulioo.normalizedapi.model.Passport;
import com.trulioo.normalizedapi.model.PersonInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The data field name-value pairs for the data elements on which the verification is to be performed
 */
@ApiModel(description = "The data field name-value pairs for the data elements on which the verification is to be performed")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T15:09:55.671-07:00")
public class DataFields {
  @SerializedName("PersonInfo")
  private PersonInfo personInfo = null;

  @SerializedName("Location")
  private Location location = null;

  @SerializedName("Communication")
  private Communication communication = null;

  @SerializedName("DriverLicence")
  private DriverLicence driverLicence = null;

  @SerializedName("NationalIds")
  private List<NationalId> nationalIds = null;

  @SerializedName("Passport")
  private Passport passport = null;

  @SerializedName("Document")
  private Document document = null;

  @SerializedName("Business")
  private Business business = null;

  @SerializedName("CountrySpecific")
  private Map<String, Map<String, String>> countrySpecific = null;

  public DataFields personInfo(PersonInfo personInfo) {
    this.personInfo = personInfo;
    return this;
  }

   /**
   * Personal Information
   * @return personInfo
  **/
  @ApiModelProperty(value = "Personal Information")
  public PersonInfo getPersonInfo() {
    return personInfo;
  }

  public void setPersonInfo(PersonInfo personInfo) {
    this.personInfo = personInfo;
  }

  public DataFields location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Location Information
   * @return location
  **/
  @ApiModelProperty(value = "Location Information")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public DataFields communication(Communication communication) {
    this.communication = communication;
    return this;
  }

   /**
   * Communication Information
   * @return communication
  **/
  @ApiModelProperty(value = "Communication Information")
  public Communication getCommunication() {
    return communication;
  }

  public void setCommunication(Communication communication) {
    this.communication = communication;
  }

  public DataFields driverLicence(DriverLicence driverLicence) {
    this.driverLicence = driverLicence;
    return this;
  }

   /**
   * Driver Licence Information
   * @return driverLicence
  **/
  @ApiModelProperty(value = "Driver Licence Information")
  public DriverLicence getDriverLicence() {
    return driverLicence;
  }

  public void setDriverLicence(DriverLicence driverLicence) {
    this.driverLicence = driverLicence;
  }

  public DataFields nationalIds(List<NationalId> nationalIds) {
    this.nationalIds = nationalIds;
    return this;
  }

  public DataFields addNationalIdsItem(NationalId nationalIdsItem) {
    if (this.nationalIds == null) {
      this.nationalIds = new ArrayList<NationalId>();
    }
    this.nationalIds.add(nationalIdsItem);
    return this;
  }

   /**
   * National Identification Information
   * @return nationalIds
  **/
  @ApiModelProperty(value = "National Identification Information")
  public List<NationalId> getNationalIds() {
    return nationalIds;
  }

  public void setNationalIds(List<NationalId> nationalIds) {
    this.nationalIds = nationalIds;
  }

  public DataFields passport(Passport passport) {
    this.passport = passport;
    return this;
  }

   /**
   * Passport information
   * @return passport
  **/
  @ApiModelProperty(value = "Passport information")
  public Passport getPassport() {
    return passport;
  }

  public void setPassport(Passport passport) {
    this.passport = passport;
  }

  public DataFields document(Document document) {
    this.document = document;
    return this;
  }

   /**
   * Document information
   * @return document
  **/
  @ApiModelProperty(value = "Document information")
  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  public DataFields business(Business business) {
    this.business = business;
    return this;
  }

   /**
   * Business information
   * @return business
  **/
  @ApiModelProperty(value = "Business information")
  public Business getBusiness() {
    return business;
  }

  public void setBusiness(Business business) {
    this.business = business;
  }

  public DataFields countrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
    return this;
  }

  public DataFields putCountrySpecificItem(String key, Map<String, String> countrySpecificItem) {
    if (this.countrySpecific == null) {
      this.countrySpecific = new HashMap<String, Map<String, String>>();
    }
    this.countrySpecific.put(key, countrySpecificItem);
    return this;
  }

   /**
   * CountrySpecific fields  {\&quot;CountryCode\&quot; : {\&quot;Field1\&quot; : \&quot;Value\&quot;,  \&quot;Field2\&quot; : \&quot;Value\&quot;  }}
   * @return countrySpecific
  **/
  @ApiModelProperty(value = "CountrySpecific fields  {\"CountryCode\" : {\"Field1\" : \"Value\",  \"Field2\" : \"Value\"  }}")
  public Map<String, Map<String, String>> getCountrySpecific() {
    return countrySpecific;
  }

  public void setCountrySpecific(Map<String, Map<String, String>> countrySpecific) {
    this.countrySpecific = countrySpecific;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataFields dataFields = (DataFields) o;
    return Objects.equals(this.personInfo, dataFields.personInfo) &&
        Objects.equals(this.location, dataFields.location) &&
        Objects.equals(this.communication, dataFields.communication) &&
        Objects.equals(this.driverLicence, dataFields.driverLicence) &&
        Objects.equals(this.nationalIds, dataFields.nationalIds) &&
        Objects.equals(this.passport, dataFields.passport) &&
        Objects.equals(this.document, dataFields.document) &&
        Objects.equals(this.business, dataFields.business) &&
        Objects.equals(this.countrySpecific, dataFields.countrySpecific);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personInfo, location, communication, driverLicence, nationalIds, passport, document, business, countrySpecific);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataFields {\n");
    
    sb.append("    personInfo: ").append(toIndentedString(personInfo)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    driverLicence: ").append(toIndentedString(driverLicence)).append("\n");
    sb.append("    nationalIds: ").append(toIndentedString(nationalIds)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    business: ").append(toIndentedString(business)).append("\n");
    sb.append("    countrySpecific: ").append(toIndentedString(countrySpecific)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

