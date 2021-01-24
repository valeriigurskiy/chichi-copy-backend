package chichi.copy.dto;

import chichi.copy.entity.Salon;
import chichi.copy.entity.ServiceInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class SingleServiceDTO {
//    private String title;
//    private String description;
//    private String city;
//    private String address;
//    private String comments;
//    private String instagram;
//    private String type;
//    private String image;
    private Salon salon;
    private List<ServiceInfo> serviceInfoList;
}
