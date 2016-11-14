
package us.kbase.kbphylosift;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: RunPhylosiftParams</p>
 * <pre>
 * Insert your typespec information here.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "input_reads_ref",
    "output_tax_profile_name"
})
public class RunPhylosiftParams {

    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("input_reads_ref")
    private String inputReadsRef;
    @JsonProperty("output_tax_profile_name")
    private String outputTaxProfileName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public RunPhylosiftParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("input_reads_ref")
    public String getInputReadsRef() {
        return inputReadsRef;
    }

    @JsonProperty("input_reads_ref")
    public void setInputReadsRef(String inputReadsRef) {
        this.inputReadsRef = inputReadsRef;
    }

    public RunPhylosiftParams withInputReadsRef(String inputReadsRef) {
        this.inputReadsRef = inputReadsRef;
        return this;
    }

    @JsonProperty("output_tax_profile_name")
    public String getOutputTaxProfileName() {
        return outputTaxProfileName;
    }

    @JsonProperty("output_tax_profile_name")
    public void setOutputTaxProfileName(String outputTaxProfileName) {
        this.outputTaxProfileName = outputTaxProfileName;
    }

    public RunPhylosiftParams withOutputTaxProfileName(String outputTaxProfileName) {
        this.outputTaxProfileName = outputTaxProfileName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((("RunPhylosiftParams"+" [workspaceName=")+ workspaceName)+", inputReadsRef=")+ inputReadsRef)+", outputTaxProfileName=")+ outputTaxProfileName)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
