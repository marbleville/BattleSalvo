package cs3500.pa04.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ReportDamageMessage(@JsonProperty("report-damage") Coord[] coordinates) {
}
