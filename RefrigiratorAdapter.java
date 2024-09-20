public class RefrigiratorAdapter implements PowerOutlet{

    private Refrigirator refrigirator;

    public RefrigiratorAdapter(Refrigirator refrigirator){
        this.refrigirator = refrigirator;
    }
    
    @Override
    public String plugIn(){
        return refrigirator.startCooling();
    }
}