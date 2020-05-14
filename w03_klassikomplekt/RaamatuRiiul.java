import java.util.ArrayList;
import java.util.List;

public class RaamatuRiiul {
    private List<Raamat> raamatud;


    public RaamatuRiiul() {
        this.raamatud = new ArrayList<>();
    }
    public List<Raamat> getRaamatud() {
        return raamatud;
    }

    public void lisaRaamat(Raamat raamat) {
        raamatud.add(raamat);
    }

    public Integer getRaamatuteArv() {
        return raamatud.size();
    }
    
    public void prindi() {
        for (int i = 0; i < raamatud.size(); i++) {
            System.out.println(raamatud.get(i));
        }
    }
}