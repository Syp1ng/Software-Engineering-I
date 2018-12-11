package Airport.Ground_Operations;

import Airport.AirCargoPalletLifter.AirCargoPalletLifterReceipt;
import Airport.AirCargoPalletLifter.IAirCargoPalletLifter;
import Airport.Airport.Airport;
import Airport.Airport.Gate;
import Airport.Baggage_Sorting_Unit.Receipts.BaggageSortingUnitReceipt;
import Airport.Baggage_Sorting_Unit.Receipts.ContainerLifterReceipt;
import Airport.Baggage_Sorting_Unit.Vehicles.IBaggageVehicle;
import Airport.Baggage_Sorting_Unit.Vehicles.IContainerLifter;
import Airport.Customs.CustomsReceipt;
import Airport.Federal_Police.FederalPoliceReceipt;
import Airport.Pushback_Vehicle.PushBackVehicleReceipt;
import Airport.Security_Check.SecurityCheckReceipt;
import Airport.Service_Vehicle.*;
import Airport.Boarding_Control.BoardingControlReceipt;
import Airport.Checkin_Desk.CheckInDeskReceipt;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;
import Airport.Sky_Tanking_Vehicle.FuelReceipt;
import Airport.Sky_Tanking_Vehicle.ISkyTankingVehicle;

import java.util.ArrayList;

public class GroundOperationsCenter implements IGroundOperationsCenter, IGroundOperationsCenterLogEngine{
    private Airport airport;
    private ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptList;
    private ArrayList<CheckInDeskReceipt> checkInReceiptList;
    private ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptList;
    private ArrayList<SecurityCheckReceipt> securityCheckReceiptList;
    private ArrayList<FederalPoliceReceipt> federalPoliceReceiptList;
    private ArrayList<CustomsReceipt> customsReceiptList;
    private ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptList;
    private ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptList;
    private ArrayList<ContainerLifterReceipt> containerLifterReceiptList;
    private ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptLis;
    private ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList;
    private ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList;
    private ArrayList<FuelReceipt> fuelReceiptList;
    private ArrayList<BoardingControlReceipt> boardingControlReceiptList;
    private ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptList;

    ///
    ///  Konstruktor
    ///

    public GroundOperationsCenter(Airport airport){
        this.airport = airport;
    }

    ///
    ///  Getter und Setter
    ///

    public void setAirport(Airport airport){
        this.airport = airport;
    }

    ///
    /// IGroundOperationCenter
    ///

    @Override
    public boolean assign(IBaggageVehicle baggageVehicle, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IContainerLifter containerLifter, Gate gate) {
        return false;
        //TODO
    }

    @Override
    public boolean assign(ISkyTankingVehicle skyTankingVehicle, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleBase serviceVehicleBase, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IAirCargoPalletLifter airCargoPalletLifter, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleFreshWater serviceVehicleFreshWater, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleWasteWater serviceVehicleWasteWater, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public boolean assign(IServiceVehicleNitrogenOxygen serviceVehicleNitrogenOxygen, Gate gate) {
        //TODO
        return false;
    }

    @Override
    public void receive(FuelReceipt fuelReceipt) {
        //TODO
    }

    @Override
    public void receive(CustomsReceipt customsReceipt) {
        //TODO
    }

    @Override
    public void receive(CheckInDeskReceipt checkInReceipt) {
        //TODO
    }

    @Override
    public void receive(FederalPoliceReceipt federalPoliceReceipt) {
        //TODO
    }

    @Override
    public void receive(SecurityCheckReceipt securityCheckReceipt) {
        //TODO
    }

    @Override
    public void receive(BoardingControlReceipt boardingControlReceipt) {
        //TODO
    }

    @Override
    public void receive(ContainerLifterReceipt containerLifterReceipt) {
        //TODO
    }

    @Override
    public void receive(PushBackVehicleReceipt pushBackVehicleReceipt) {
        //TODO
    }

    @Override
    public void receive(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt) {
        //TODO
    }

    @Override
    public void receive(BaggageSortingUnitReceipt baggageSortingUnitReceipt) {
        //TODO
    }

    @Override
    public void receive(ServiceVehicleBaseReceipt serviceVehicleBaseReceipt) {
        //TODO
    }

    @Override
    public void receive(AirCargoPalletLifterReceipt airCargoPalletLifterReceipt) {
        //TODO
    }

    @Override
    public void receive(ServiceVehicleFreshWaterReceipt serviceVehicleFreshWaterReceipt) {
        //TODO
    }

    @Override
    public void receive(ServiceVehicleWasteWaterReceipt serviceVehicleWasteWaterReceipt) {
        //TODO
    }

    @Override
    public void receive(ServiceVehicleNitrogenOxygenReceipt serviceVehicleNitrogenOxygenReceipt) {
        //TODO
    }

    ///
    /// IGroundOperationsLogEngine
    ///


    @Override
    public void logServiceVehicleWasteWater(ArrayList<ServiceVehicleWasteWaterReceipt> serviceVehicleWasteWaterReceiptList) {
        //TODO
    }

    @Override
    public void logCheckIn(ArrayList<CheckInDeskReceipt> checkInDeskReceiptList) {
        //TODO
    }

    @Override
    public void logBulkyBaggageDesk(ArrayList<BulkyBaggageDeskReceipt> bulkyBaggageDeskReceiptList) {
        //TODO
    }

    @Override
    public void logSecurityCheck(ArrayList<SecurityCheckReceipt> securityCheckReceiptList) {
        //TODO
    }

    @Override
    public void logFederalPolice(ArrayList<FederalPoliceReceipt> federalPoliceReceiptList) {
        //TODO
    }

    @Override
    public void logCustoms(ArrayList<CustomsReceipt> customsReceiptList) {
        //TODO
    }

    @Override
    public void logCargoPalletLifter(ArrayList<AirCargoPalletLifterReceipt> airCargoPalletLifterReceiptList) {
        //TODO
    }

    @Override
    public void logBaggageSortingUnit(ArrayList<BaggageSortingUnitReceipt> baggageSortingUnitReceiptList) {
        //TODO
    }

    @Override
    public void logContainerLifter(ArrayList<ContainerLifterReceipt> containerLifterReceiptList) {
        //TODO
    }

    @Override
    public void logServiceVehicleBase(ArrayList<ServiceVehicleBaseReceipt> serviceVehicleBaseReceiptList) {
        //TODO
    }

    @Override
    public void logServiceVehicleNitrogenOxygen(ArrayList<ServiceVehicleNitrogenOxygenReceipt> serviceVehicleNitrogenOxygenReceiptList) {
        //TODO
    }

    @Override
    public void logServiceVehicleFreshWater(ArrayList<ServiceVehicleFreshWaterReceipt> serviceVehicleFreshWaterReceiptList) {
        //TODO
    }

    @Override
    public void logFuel(ArrayList<FuelReceipt> fuelReceiptList) {
        //TODO
    }

    @Override
    public void logBoardingControl(ArrayList<BoardingControlReceipt> boardingControlReceiptList) {
        //TODO
    }

    @Override
    public void logPushbackVehicle(ArrayList<PushBackVehicleReceipt> pushBackVehicleReceiptList) {
        //TODO
    }
}
