package stellarwitch7.dragoncurse.spell.trick;

import dev.enjarai.trickster.spell.trick.Trick;
import dev.enjarai.trickster.spell.trick.Tricks;
import net.minecraft.registry.Registry;

public class ModTricks {
    public static <T extends Trick> T register(String path, T trick) {
        return Registry.register(Tricks.REGISTRY, Dragoncurse.id(path), trick);
    }

    public static void register() {
        // init statics
    }
}
