/*
 * Copyright 2024 RealYusufIsmail.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
package io.github.realyusufismail.realyusufismailcore.core.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class TagsInit {
    public static final class Blocks {
        // ores
        public static final ITag.INamedTag<Block> ORES_COPPER = forge("ores/copper");
        // blocks
        public static final ITag.INamedTag<Block> STORAGE_COPPER = forge("storage_blocks/copper");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }
    }

    public static final class Items {
        // ores
        public static final ITag.INamedTag<Item> ORES_COPPER = forge("ores/copper");
        // blocks
        public static final ITag.INamedTag<Item> STORAGE_COPPER = forge("storage_blocks/copper");
        // items
        public static final ITag.INamedTag<Item> INGOTS_COPPER = forge("ingots/copper");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }
    }
}
