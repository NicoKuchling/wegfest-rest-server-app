package de.nicokuchling.wegfest_rest_server_app.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.nicokuchling.wegfest_rest_server_app.model.Person;
import de.nicokuchling.wegfest_rest_server_app.model.SceneData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public class Iteration   {
  
  private String id;
  private Person person;
  private Boolean completed;
  private Boolean wasAborted;
  private LocalDate dateOfCompletion;
  private SceneData sceneData;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("_id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("person")
  public Person getPerson() {
    return person;
  }
  public void setPerson(Person person) {
    this.person = person;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("wasAborted")
  public Boolean getWasAborted() {
    return wasAborted;
  }
  public void setWasAborted(Boolean wasAborted) {
    this.wasAborted = wasAborted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dateOfCompletion")
  public LocalDate getDateOfCompletion() {
    return dateOfCompletion;
  }
  public void setDateOfCompletion(LocalDate dateOfCompletion) {
    this.dateOfCompletion = dateOfCompletion;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sceneData")
  public SceneData getSceneData() {
    return sceneData;
  }
  public void setSceneData(SceneData sceneData) {
    this.sceneData = sceneData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Iteration iteration = (Iteration) o;
    return Objects.equals(id, iteration.id) &&
        Objects.equals(person, iteration.person) &&
        Objects.equals(completed, iteration.completed) &&
        Objects.equals(wasAborted, iteration.wasAborted) &&
        Objects.equals(dateOfCompletion, iteration.dateOfCompletion) &&
        Objects.equals(sceneData, iteration.sceneData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, person, completed, wasAborted, dateOfCompletion, sceneData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Iteration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    wasAborted: ").append(toIndentedString(wasAborted)).append("\n");
    sb.append("    dateOfCompletion: ").append(toIndentedString(dateOfCompletion)).append("\n");
    sb.append("    sceneData: ").append(toIndentedString(sceneData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

