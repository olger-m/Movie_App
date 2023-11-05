package bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rating{
    @JsonProperty("Source")
    public String source;
    @JsonProperty("Value") 
    public String value;
}
