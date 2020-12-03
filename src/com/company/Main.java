package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
                Vehicles v = new Vehicles();
                Scanner inputScanner = new Scanner(System.in);
                String userInput = "";
                Reservation[] reservations = new Reservation[20];
                int rcount = 0;
                do {
                    displayMenu(v, reservations, rcount);
                    System.out.print("Do you want to return to menu ( [Y]/ [N])? ");
                    userInput = inputScanner.nextLine();
                    System.out.println(userInput);
                    rcount++;
                } while (userInput.equals("Y") || userInput.equals(""));

            }


            public static void displayMenu(Vehicles m, Reservation[] reservations, int rcount) {
                Reservation resv = new Reservation();

                //Cars
                System.out.println("-------------------------------");
                m.add (new Car("Model:Chevrolet Camaro - 2018(Car)",30, 2, "VIN: HK4GM4564GD", resv));
                m.add(new Car("Model:Ford Fusion - 2018(Car)", 34, 4, "VIN: AB4EG5689GM", resv));
                m.add(new Car("Model:Ford Fusion Hybrid - 2017(Car)", 32, 4, "VIN: KU4EG3245RW", resv));
                m.add(new Car("Model:Chevrolet Impala - 2018(Car)", 30, 4, "VIN: RK3BM4366YH", resv));

                //SUVs
                m.add(new SUV("Model:Honda Odyssey - 2020(SUV)", 28, 7, 6, "VIN: VN9RE2635TD", resv));
                m.add(new SUV("Model:Dodge Caravan - 2019(SUV)", 25, 5, 4, "VIN: QK3FL4273ME", resv));
                m.add(new SUV("Model:Ford Expedition - 2018(SUV)", 20, 5, 3, "VIN: JK2RT9264HY", resv));

                //Trucks
                m.add(new Truck("Model:Ten-Foot(Truck)", 12, 2810, "VIN: EJ5KU2435BC", resv));
                m.add(new Truck("Model:Eighteen-Foot(Truck)", 10, 5830, "VIN: KG4DM5472RK", resv));
                m.add(new Truck("Model:Twenty-Four-Foot(Truck)", 8, 6500, "VIN: EB2WR3082QB", resv));
                m.add(new Truck("Model:Twenty-Four-Foot (Truck)", 8, 6500, "VIN: TV3GH4280EK", resv));



                System.out.println("1 - Display all vehicles");
                System.out.println("2 - Display available vehicles");
                System.out.println("3 - Reserve a vehicle");
                System.out.println("4 - Display reservations");
                System.out.println("5 - Cancel a reservation");
                System.out.println("6 - Add a vehicle");
                System.out.println("7 - Quit");

                int userInput;
                Scanner cin = new Scanner(System.in);
                userInput = cin.nextInt();

                switch(userInput){
                    case 1:
                        m.showAll();
                        break;
                    case 2:
                        m.showAll();
                        break;

                    // Reserve a vehicle
                    case 3:
                        Reservation myRes = reserve(reservations);
                        reservations[rcount] = myRes;
                        System.out.println(reservations[rcount]);
                        rcount++;
                        System.out.println(rcount);
                        break;

                    // Display reservation
                    case 4:
                        getReservations(reservations);
                        break;

                    // Cancel reservation
                    case 5:
                        System.out.println("What is the VIN: ");
                        String vin1 = cin.next();
                        cancelReservation(reservations, vin1);
                        break;

                    case 6:
                        System.out.println("Vehicle type(1 for Car, 2 for SUV, 3 for Truck:");
                        int choice = cin.nextInt();

                        if(choice == 1)
                        {
                            System.out.println("Model/Make: ");
                            String model = cin.next();

                            System.out.println("MPG: ");
                            int mpg = cin.nextInt();

                            System.out.println("Seating Capacity: ");
                            int seatingCapacity = cin.nextInt();

                            System.out.println("VIN: ");
                            String vin = cin.next();
                            System.out.println("Vehicle added.");

                            Car cr = new Car(model, mpg, seatingCapacity, vin);
                            m.add(cr);
                        }else if (choice == 2){

                            System.out.println("Model/Make: ");
                            String model = cin.next();

                            System.out.println("MPG: ");
                            int mpg = cin.nextInt();

                            System.out.println("Seating Capacity: ");
                            int seatingCapacity = cin.nextInt();

                            System.out.println("Cargo Capacity: ");
                            int cargoCapacity = cin.nextInt();

                            System.out.println("VIN: ");
                            String vin = cin.next();
                            System.out.println("Vehicle added.");

                            SUV sv = new SUV(model, mpg, seatingCapacity, cargoCapacity, vin);
                            m.add(sv);
                        }else{
                            System.out.println("Model/Make: ");
                            String model = cin.next();

                            System.out.println("MPG: ");
                            int mpg = cin.nextInt();

                            System.out.println("Load Capacity: ");
                            int loadCapacity = cin.nextInt();

                            System.out.println("VIN: ");
                            String vin = cin.next();

                            Truck tk = new Truck(model, mpg, loadCapacity,vin);
                            m.add(tk);
                            System.out.println("Vehicle added.");
                        }
                        break;

                }
            }


            public static void getReservations(Reservation[] reservations){
                for (int i = 0; i <= reservations.length-1; i++){
                    System.out.println(reservations[i]);
                }


            }

            public static boolean isReserved(Reservation r){
                return r.getReserved();
            }

            public static Reservation reserve(Reservation[] reservations){
                // Ask for all the necessary information to make the reservation class
                Scanner cin = new Scanner(System.in);
                int count = 0;

                System.out.println("Credit card number: ");
                String cnum = cin.next();
                System.out.println("Days(D), Weeks(W), or Months(M): ");
                char period = cin.next().charAt(0);
                System.out.println("For how long: ");
                int time = cin.nextInt();

                System.out.println("What is the VIN: ");
                String vin = cin.next();

                // Create TimeSpan Object
                timeSpan t = new timeSpan(period, time);
                System.out.println("Do you want insurance (Y/N): ");
                boolean insurance = false;
                if (cin.next().equals("Y") || cin.next().equals("y")){
                    insurance = true;
                }

                // Create Reservation object
                Reservation res = new Reservation(cnum, t, insurance, vin);System.out.println("Reservation set");
                return res;

            }

            public static void cancelReservation(Reservation[] reservations,String vin){

                Reservation[] proxy = new Reservation[reservations.length-1];

                for (int i = 0; i <= reservations.length-1; i++){
                    if(reservations[i] != null){
                        if (reservations[i].VIN.equals(vin)){

                        } else {
                            proxy[i] = reservations[i];
                        }
                    }
                }

                for(int i = 0; i <= reservations.length-2; i++){
                    reservations[i] = proxy[i];
                }

                System.out.println("Reservation canceled");
            }

        }
