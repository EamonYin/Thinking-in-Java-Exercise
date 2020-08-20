package Chapter14.Test15;

import Chapter14.Test15.factory.Factory;
import Chapter14.Test15.pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/8/20,17:23
 * @version:1.0
 */
public class PetFactory {
    private static class RFPetCreator extends PetCreator {

        static List<Factory<? extends typeinfo.pets.Pet>> petFactories =
                Arrays.asList(new Mutt.Factory(), new Pug.Factory(),
                        new EgyptianMau.Factory(), new Manx.Factory(),
                        new Cymric.Factory(), new Rat.Factory(),
                        new Mouse.Factory(), new Hamster.Factory());

        @Override
        public List<Class<? extends typeinfo.pets.Pet>> types() {
            return null;
        }

        @Override
        public typeinfo.pets.Pet randomPet() { // Make 1 random Pet
            int n = rand.nextInt(petFactories.size());
            return petFactories.get(n).create();
        }

        private static Random rand = new Random(47);
    }

    public static final PetCreator creator =
            new RFPetCreator();

    public static typeinfo.pets.Individual randomPet() {
        return creator.randomPet();
    }

    public static typeinfo.pets.Individual[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<typeinfo.pets.Pet> arrayList(int size) {
        return creator.arrayList(size);
    }

}
