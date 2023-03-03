package me.iris.ambien.obfuscator.transformers.implementations.packaging;

import me.iris.ambien.obfuscator.settings.data.implementations.StringSetting;
import me.iris.ambien.obfuscator.transformers.data.Category;
import me.iris.ambien.obfuscator.transformers.data.Transformer;
import me.iris.ambien.obfuscator.transformers.data.annotation.TransformerInfo;
import me.iris.ambien.obfuscator.wrappers.JarWrapper;

/**
 * ZIP File comment
 */
@TransformerInfo(
        name = "comment",
        category = Category.PACKAGING
)
public class Comment extends Transformer {
    public static final StringSetting commentText = new StringSetting("comment-text", "Obfuscated by Ambien");

    @Override
    public void transform(JarWrapper wrapper) {
        // Transformation takes place when exporting
    }
}
