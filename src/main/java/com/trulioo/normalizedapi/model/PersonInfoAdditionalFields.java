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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-03T13:54:47.084-08:00")
public class PersonInfoAdditionalFields {
  @SerializedName("FullName")
  private String fullName = null;

  public PersonInfoAdditionalFields fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of of the individual to be verified
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of of the individual to be verified")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonInfoAdditionalFields personInfoAdditionalFields = (PersonInfoAdditionalFields) o;
    return Objects.equals(this.fullName, personInfoAdditionalFields.fullName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonInfoAdditionalFields {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
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

