public class HospitalApp {

    public static void main(String[] args) {
        Doctor mcDreamy = new Doctor(90000.00, "Derek Shepherd", 1, "Neurology");
        System.out.println(mcDreamy);

        int mcDreamyEmployeeNum = mcDreamy.getEmployeeNumber();
        System.out.println("McDreamy's employee number is " + mcDreamyEmployeeNum);
    }
}
