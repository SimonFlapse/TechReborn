/*
 * This file is part of TechReborn, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2017 TechReborn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package techreborn.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class TechRebornConfigGui extends GuiConfig {
	public TechRebornConfigGui(GuiScreen top) {
		super(top, getConfigCategories(), "TechReborn", false, false,
			GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
	}

	private static List<IConfigElement> getConfigCategories() {
		List<IConfigElement> list = new ArrayList<>();
		list.add(
			new DummyConfigElement.DummyCategoryElement(I18n.translateToLocal("config.techreborn.category.general"),
				"tr.configgui.category.trGeneral", TRGeneral.class));
		list.add(new DummyConfigElement.DummyCategoryElement(I18n.translateToLocal("config.techreborn.category.world"),
			"tr.configgui.category.trWorld", TRWORLD.class));
		list.add(new DummyConfigElement.DummyCategoryElement(I18n.translateToLocal("config.techreborn.category.power"),
			"tr.configgui.category.trPower", TRPOWER.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
			I18n.translateToLocal("config.techreborn.category.crafting"), "tr.configgui.category.trCrafting",
			TRCRAFTING.class));
		list.add(new DummyConfigElement.DummyCategoryElement(I18n.translateToLocal("config.techreborn.category.uu"),
			"tr.configgui.category.truu", TRUU.class));
		list.add(new DummyConfigElement.DummyCategoryElement(I18n.translateToLocal("config.techreborn.category.emc"),
			"tr.configgui.category.tremc", TREMC.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
			I18n.translateToLocal("config.techreborn.category.integration"), "tr.configgui.category.treinter",
			TRINT.class));

		return list;
	}

	public static class TRGeneral extends CategoryEntry {

		public TRGeneral(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(Configuration.CATEGORY_GENERAL)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// World
	public static class TRWORLD extends CategoryEntry {
		public TRWORLD(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_WORLD)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// Power
	public static class TRPOWER extends CategoryEntry {
		public TRPOWER(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_POWER)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// Crafting
	public static class TRCRAFTING extends CategoryEntry {
		public TRCRAFTING(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_CRAFTING)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// Crafting
	public static class TRUU extends CategoryEntry {
		public TRUU(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_UU)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// Emc
	public static class TREMC extends CategoryEntry {
		public TREMC(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_EMC)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}

	// Mod Integration
	public static class TRINT extends CategoryEntry {
		public TRINT(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement configElement) {
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen() {
			return new GuiConfig(this.owningScreen,
				(new ConfigElement(ConfigTechReborn.config.getCategory(ConfigTechReborn.CATEGORY_INTEGRATION)))
					.getChildElements(),
				this.owningScreen.modID, Configuration.CATEGORY_GENERAL,
				this.configElement.requiresWorldRestart() || this.owningScreen.allRequireWorldRestart,
				this.configElement.requiresMcRestart() || this.owningScreen.allRequireMcRestart,
				GuiConfig.getAbridgedConfigPath(ConfigTechReborn.config.toString()));
		}
	}
}