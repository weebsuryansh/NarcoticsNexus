package org.project.narcoticsnexus.model;

import jakarta.persistence.Lob;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellStats {
    private String vendorUsername;
    private String productName;
    private long productId;
    private int sale;
    private float earnings;
}
