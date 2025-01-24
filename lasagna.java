public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    
    /*public int remainingMinutesInOven(int time){
        int expectedMin = new Lasagna().expectedMinutesInOven();
        return expectedMin - time;
    }*/
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    /*public int totalTimeInMinutes(int layers, int time){
        int total = new Lasagna().preparationTimeInMinutes(layers);
        return total + time;        
    }*/
    public int totalTimeInMinutes(int layers, int time){
        return preparationTimeInMinutes(layers) + time;
    }
}
