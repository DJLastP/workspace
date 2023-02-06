package empService;

public class EmpService {
    private String name;
    private String id;
    private String pw;
    private String tel;
    private int pay;
    private String dep;

    public EmpService(String name,String id, String pw, String tel, int pay, String dep){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.tel = tel;
        this.pay = pay;
        this.dep = dep;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
