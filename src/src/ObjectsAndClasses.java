public class ObjectsAndClasses {
    private int CurrentFloor;
    private boolean GoingUp;
    private boolean GoingDown;

    public ObjectsAndClasses()
    {
        CurrentFloor = 1;
        GoingDown = GoingUp = false;

    }

    public void displayCurrentFloorI()
    {
        System.out.println("\n You are at Floor:" + CurrentFloor+"\n");
    }
    public void GoUp()
    {
        if (CurrentFloor>=3) {
            System.out.println("\n You have reached the top floor of" + "this building and cannot go any higher\n");

            GoingUp = false;
        }
        else
        {
            CurrentFloor+= 1;
            GoingUp = true;
            GoingDown = false;
        }

    }
    public void GoDown()
    {
        if (CurrentFloor <=1)
        {
            System.out.println("\n You have reached the first floor of" +
                    " this building please exit the elevator \n");
            GoingDown = false;

        }
        else
        {
            CurrentFloor -=1;
            GoingUp = false;
            GoingDown = true;
        }
    }
    public class ElevatorTest
    {
        public void main(String[] args)
        {
            ObjectsAndClasses lift = new ObjectsAndClasses();
            lift.displayCurrentFloorI();
            lift.GoUp();
            lift.displayCurrentFloorI();
            lift.GoUp();
            lift.displayCurrentFloorI();
            lift.GoUp();
            lift.displayCurrentFloorI();
            lift.GoDown();
            lift.displayCurrentFloorI();
            lift.GoDown();
            lift.displayCurrentFloorI();
            lift.GoDown();
            lift.displayCurrentFloorI();

        }
    }
}// end class ObjectsAndClasses
