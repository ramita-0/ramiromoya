import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Base b = new Base("b");
        Base b1 = new Base("b1");
        Base b2 = new Base("b2");
        BaseNormal bn = new BaseNormal("bn");
        BaseNormal bn1 = new BaseNormal("bn1");
        BaseNormal bn2 = new BaseNormal("bn2");

        UnidadAdministrativa u = new UnidadAdministrativa("unidadAdmin", new ArrayList<>());
        UnidadAdministrativa u1 = new UnidadAdministrativa("unidadAdmin1", new ArrayList<>());

        u.addBase(b);
        u.addBase(b1);
        u.addBase(b2);
        u.addBase(bn);
        u.addBase(bn1);
        u.addBase(bn2);

        u.addBase(u1);

        u.getAllBases();
    }
}
