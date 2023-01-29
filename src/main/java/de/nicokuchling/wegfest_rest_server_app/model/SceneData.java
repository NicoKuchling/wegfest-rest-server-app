package de.nicokuchling.wegfest_rest_server_app.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.nicokuchling.wegfest_rest_server_app.model.Answer;
import de.nicokuchling.wegfest_rest_server_app.model.Scene;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-01-29T17:42:09.387959900+01:00[Europe/Berlin]")
public class SceneData   {
  
  private String id;
  private Scene scene;
  private String unitySceneId;
  private String playerPosition;
  private String daytime;
  private Integer speedLimit;
  private String eMobilityFrequency;
  private String trafficVolume;
  private Boolean cyclists;
  private java.math.BigDecimal crossingDuration;
  private java.math.BigDecimal timeForOrientation;
  private Integer numberOfDangerousSituations;
  private Integer numberOfAccidents;
  private Integer numberOfCrossingAttempts;
  private List<Answer> answers = new ArrayList<>();

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
  @JsonProperty("scene")
  public Scene getScene() {
    return scene;
  }
  public void setScene(Scene scene) {
    this.scene = scene;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("unitySceneId")
  public String getUnitySceneId() {
    return unitySceneId;
  }
  public void setUnitySceneId(String unitySceneId) {
    this.unitySceneId = unitySceneId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("playerPosition")
  public String getPlayerPosition() {
    return playerPosition;
  }
  public void setPlayerPosition(String playerPosition) {
    this.playerPosition = playerPosition;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("daytime")
  public String getDaytime() {
    return daytime;
  }
  public void setDaytime(String daytime) {
    this.daytime = daytime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("speedLimit")
  public Integer getSpeedLimit() {
    return speedLimit;
  }
  public void setSpeedLimit(Integer speedLimit) {
    this.speedLimit = speedLimit;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("eMobilityFrequency")
  public String geteMobilityFrequency() {
    return eMobilityFrequency;
  }
  public void seteMobilityFrequency(String eMobilityFrequency) {
    this.eMobilityFrequency = eMobilityFrequency;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("trafficVolume")
  public String getTrafficVolume() {
    return trafficVolume;
  }
  public void setTrafficVolume(String trafficVolume) {
    this.trafficVolume = trafficVolume;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cyclists")
  public Boolean getCyclists() {
    return cyclists;
  }
  public void setCyclists(Boolean cyclists) {
    this.cyclists = cyclists;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("crossingDuration")
  public java.math.BigDecimal getCrossingDuration() {
    return crossingDuration;
  }
  public void setCrossingDuration(java.math.BigDecimal crossingDuration) {
    this.crossingDuration = crossingDuration;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("timeForOrientation")
  public java.math.BigDecimal getTimeForOrientation() {
    return timeForOrientation;
  }
  public void setTimeForOrientation(java.math.BigDecimal timeForOrientation) {
    this.timeForOrientation = timeForOrientation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfDangerousSituations")
  public Integer getNumberOfDangerousSituations() {
    return numberOfDangerousSituations;
  }
  public void setNumberOfDangerousSituations(Integer numberOfDangerousSituations) {
    this.numberOfDangerousSituations = numberOfDangerousSituations;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfAccidents")
  public Integer getNumberOfAccidents() {
    return numberOfAccidents;
  }
  public void setNumberOfAccidents(Integer numberOfAccidents) {
    this.numberOfAccidents = numberOfAccidents;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("numberOfCrossingAttempts")
  public Integer getNumberOfCrossingAttempts() {
    return numberOfCrossingAttempts;
  }
  public void setNumberOfCrossingAttempts(Integer numberOfCrossingAttempts) {
    this.numberOfCrossingAttempts = numberOfCrossingAttempts;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("answers")
  public List<Answer> getAnswers() {
    return answers;
  }
  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneData sceneData = (SceneData) o;
    return Objects.equals(id, sceneData.id) &&
        Objects.equals(scene, sceneData.scene) &&
        Objects.equals(unitySceneId, sceneData.unitySceneId) &&
        Objects.equals(playerPosition, sceneData.playerPosition) &&
        Objects.equals(daytime, sceneData.daytime) &&
        Objects.equals(speedLimit, sceneData.speedLimit) &&
        Objects.equals(eMobilityFrequency, sceneData.eMobilityFrequency) &&
        Objects.equals(trafficVolume, sceneData.trafficVolume) &&
        Objects.equals(cyclists, sceneData.cyclists) &&
        Objects.equals(crossingDuration, sceneData.crossingDuration) &&
        Objects.equals(timeForOrientation, sceneData.timeForOrientation) &&
        Objects.equals(numberOfDangerousSituations, sceneData.numberOfDangerousSituations) &&
        Objects.equals(numberOfAccidents, sceneData.numberOfAccidents) &&
        Objects.equals(numberOfCrossingAttempts, sceneData.numberOfCrossingAttempts) &&
        Objects.equals(answers, sceneData.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scene, unitySceneId, playerPosition, daytime, speedLimit, eMobilityFrequency, trafficVolume, cyclists, crossingDuration, timeForOrientation, numberOfDangerousSituations, numberOfAccidents, numberOfCrossingAttempts, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
    sb.append("    unitySceneId: ").append(toIndentedString(unitySceneId)).append("\n");
    sb.append("    playerPosition: ").append(toIndentedString(playerPosition)).append("\n");
    sb.append("    daytime: ").append(toIndentedString(daytime)).append("\n");
    sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
    sb.append("    eMobilityFrequency: ").append(toIndentedString(eMobilityFrequency)).append("\n");
    sb.append("    trafficVolume: ").append(toIndentedString(trafficVolume)).append("\n");
    sb.append("    cyclists: ").append(toIndentedString(cyclists)).append("\n");
    sb.append("    crossingDuration: ").append(toIndentedString(crossingDuration)).append("\n");
    sb.append("    timeForOrientation: ").append(toIndentedString(timeForOrientation)).append("\n");
    sb.append("    numberOfDangerousSituations: ").append(toIndentedString(numberOfDangerousSituations)).append("\n");
    sb.append("    numberOfAccidents: ").append(toIndentedString(numberOfAccidents)).append("\n");
    sb.append("    numberOfCrossingAttempts: ").append(toIndentedString(numberOfCrossingAttempts)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

