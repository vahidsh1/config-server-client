package com.digipay.profile;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digital")
public class OrderController {

@Value("${test.user.name}")
String user;

    @GetMapping("/list")
    public void getProductsList() throws JsonProcessingException {

        System.out.println(user);
//        rabbitTemplate.convertAndSend(exchange,routingKey,s);
    }


}



//
//    AccessController accessController;
//    @Autowired
//    DigitalService digitalService;
//    @PostMapping("/product/digitaldevices/{operationtype}")
//    public void employeeOperationManager(@PathVariable String operationtype,
//                                         @RequestBody DigitalDevice digitalDevice)
//    {
//        case("operationtype"){
//            switch ("Register"):{
//digitalService.save(digitalDevice);
//                        break;
//    }
//
////        String userNationalID = accessController.checkAccess(userName, operationtype);
////        String userNationalID = user.getNationalID();
//digitalService.save();
//    }
//    }
//    }
//
////    @PostMapping("/employee/login/{operationtype}/{categorytype}")
////    public void employeeLoginManager(@PathVariable String operationtype,
////                                     @RequestBody String userName,
////                                     @RequestBody DigitalDevice digitalDevice) {
////
////        String userNationalID = accessController.checkAccess(userName, operationtype);
////        DigitalController digitalController = new DigitalController(userNationalID, operationtype);
////
////    }
////
////                Messages.categoryMessage();
//
//
////            List<DigitalDevice> digitalDeviceList = digitalService.listAll();
//
//
////        @PostMapping("/customer")
////        public DigitalDevice createProduct (@RequestBody DigitalDevice digitalDevice){
////            digitalService.save(digitalDevice);
////            return digitalDevice;
////        }
//
//    @DeleteMapping("/delete/{id}")
//    public DigitalDevice deleteProduct(@PathVariable Integer id) {
//
//        DigitalDevice digitalDevice = digitalService.findById(id);
//        digitalService.delete(digitalDevice);
//        return digitalDevice;
//    }
//
//    @PutMapping("/update/{id}")
//    public DigitalDevice updateUser(@PathVariable Integer id, @RequestBody DigitalDevice userDetail) {
//
//        DigitalDevice digitalDevice = digitalService.findById(id);
//        digitalDevice.setRam(userDetail.getRam());
//        digitalDevice.setPrice(userDetail.getPrice());
//        digitalDevice.setBrand(userDetail.getBrand());
//        digitalDevice.setCpuModel(userDetail.getCpuModel());
//        digitalDevice.setUserNationalID(userDetail.getUserNationalID());
//        digitalService.save(digitalDevice);
//        return digitalDevice;
//    }
//}
//
//}
//    Scanner scanner = new Scanner(System.in);
//    DigitalDevice digitalDevice = new DigitalDevice();
//    DigitalRepository digitalRepository = new DigitalRepository();
//    DigitalService digitalService = new DigitalService(digitalRepository);
//    int operationType;
//    String userNationalID;
//
//    public DigitalController(int operationType) {
//        this.operationType = operationType;
//    }
//
//    public DigitalController(int operationType, String userNationalID) {
//        this.operationType = operationType;
//        this.userNationalID = userNationalID;
//    }
//
//    public void digitalOperation() {
//        switch (operationType) {
//            case (1): {
//                System.out.println("Enter CPU model:");
//                String cpuModel = scanner.next();
//                System.out.println("Enter RAM size:");
//                int ramSize = scanner.nextInt();
//                System.out.println("Enter brand name:");
//                String brand = scanner.next();
//                System.out.println("Enter price:");
//                double price = scanner.nextDouble();
//
//                digitalDevice.setCpuModel(cpuModel);
//                digitalDevice.setRam(ramSize);
//                digitalDevice.setBrand(brand);
//                digitalDevice.setPrice(price);
//                digitalDevice.setUserNationalID(userNationalID);
//
//                digitalService.create(digitalDevice);
//                break;
//            }
//            case (2): {
//                List<DigitalDevice> digitalDeviceList = digitalService.listAll(digitalDevice);
//                if (digitalDeviceList.size() > 0) {
//                    for (DigitalDevice digitalObject : digitalDeviceList) {
//                        System.out.printf(digitalObject.toString());
//                    }
//                } else {
//                    System.out.println("No product exists in this category.");
//                    throw new RuntimeException();
//                }
//                break;
//            }
//
//            case (3): {
//                System.out.println("Enter digital device ID:");
//                int digitalDeviceID = scanner.nextInt();
//                System.out.println("Enter new CPU model:");
//                String cpuModel = scanner.next();
//                System.out.println("Enter new RAM size:");
//                int ramSize = scanner.nextInt();
//                System.out.println("Enter new brand name:");
//                String brand = scanner.next();
//                System.out.println("Enter new price:");
//                double price = scanner.nextDouble();
//
//                digitalDevice.setCpuModel(cpuModel);
//                digitalDevice.setRam(ramSize);
//                digitalDevice.setBrand(brand);
//                digitalDevice.setPrice(price);
//                digitalDevice.setDigitalDeviceID(digitalDeviceID);
//                digitalService.update(digitalDevice);
//                break;
//            }
//
//            case (4): {
//                System.out.println("Enter Digital device ID: ");
//                int digitalDeviceID = scanner.nextInt();
//                digitalDevice.setDigitalDeviceID(digitalDeviceID);
//                digitalService.delete(digitalDevice);
//                break;
//            }
//
//        }
//    }
//}

