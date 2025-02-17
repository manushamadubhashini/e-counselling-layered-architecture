package lk.ijse.eCounselling.dto.tm;

import lk.ijse.eCounselling.dto.TreatmentDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TreatmentTm extends TreatmentDTO {
    private String id;
    private String status;
}
