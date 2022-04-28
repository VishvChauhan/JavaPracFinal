package E_DesignPattern.DesignPatterns;

public class AbstractFactoryM {
}

abstract class CPU{}

class aCPU extends CPU{}

class bCPU extends CPU{}

abstract class MMU{}

class cMMU extends MMU{}

class dMMU extends MMU{}




class ENG_ToolKit_Test extends AbstractFactoryTest{

    @Override
    public CPU createCPU() {
        return new aCPU();
    }

    @Override
    public MMU createMMU() {
        return new cMMU();
    }
}

class EMB_ToolKit_Test extends AbstractFactoryTest{
   @Override
    public CPU createCPU(){
        return new bCPU();
    }

    @Override
    public MMU createMMU(){
        return new dMMU();
    }
}


enum Arch{
    ENG, EMB
}


abstract class AbstractFactoryTest {

  private  static final  ENG_ToolKit_Test ENG_ToolKit = new ENG_ToolKit_Test();
  private  static final  EMB_ToolKit_Test EMB_ToolKit = new EMB_ToolKit_Test();

    static AbstractFactoryTest getInstance(Arch arch) {

        AbstractFactoryTest abt = null;
        switch (arch) {
            case ENG:
                abt = ENG_ToolKit;
                break;

            case EMB:
                abt = EMB_ToolKit;
                break;
        }
        return abt;
    }
        public abstract CPU createCPU();
        public abstract MMU createMMU();


}





