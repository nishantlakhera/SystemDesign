class Availability{

    private boolean isAvailable = true;

    public boolean checkAvailability(){
        return isAvailable;
    }

    public void borrowBook(){
        isAvailable = false;
    }

    public void returnBook(){
        isAvailable = true;
    }

}