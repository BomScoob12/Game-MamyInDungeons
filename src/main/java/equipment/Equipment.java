package equipment;;

public class Equipment {
    public final String equipName;
    public final TypeEquip type;

    public Equipment(String equipName, TypeEquip type){
        this.equipName = equipName;
        this.type = type;
    }

    public TypeEquip getType(){
        return this.type;
    }

}
