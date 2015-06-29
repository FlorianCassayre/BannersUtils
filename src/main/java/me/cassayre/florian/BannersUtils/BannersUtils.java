/**
 *  Banners util class
 *  Copyright (C) 2015 Florian Cassayre
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package me.cassayre.florian.BannersUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

public final class BannersUtils {
	
	/**
	 * The map containing all the supported characters. White color represents the background and black color the font color.
	 */
	private final static Map<Character, BannerMeta> chars = new HashMap<Character, BannerMeta>();
	
	static {
		chars.put('a', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_TOP, PatternType.STRIPE_LEFT, PatternType.STRIPE_RIGHT, PatternType.STRIPE_MIDDLE)));
		chars.put('b', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_TOP, PatternType.STRIPE_LEFT, PatternType.STRIPE_RIGHT, PatternType.STRIPE_MIDDLE, PatternType.STRIPE_BOTTOM)));
		chars.put('c', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_LEFT, PatternType.STRIPE_TOP, PatternType.STRIPE_BOTTOM)));
		chars.put('d', getBannerMeta(DyeColor.BLACK, Arrays.asList(new Pattern(DyeColor.WHITE, PatternType.RHOMBUS_MIDDLE), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT))));
		chars.put('e', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE), new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT))));
		chars.put('f', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE), new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP))));
		chars.put('g', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL), new Pattern(DyeColor.BLACK, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP))));
		chars.put('h', getBannerMeta(DyeColor.BLACK, Arrays.asList(new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP), new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT))));
		chars.put('i', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_BOTTOM, PatternType.STRIPE_TOP, PatternType.STRIPE_CENTER)));
		chars.put('j', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL), new Pattern(DyeColor.BLACK, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT))));
		chars.put('k', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE), new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNLEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT))));
		chars.put('l', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_LEFT, PatternType.STRIPE_BOTTOM)));
		chars.put('m', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_TOP), new Pattern(DyeColor.WHITE, PatternType.TRIANGLES_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT))));
		chars.put('n', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT))));
		chars.put('o', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_TOP, PatternType.STRIPE_RIGHT, PatternType.STRIPE_BOTTOM, PatternType.STRIPE_LEFT)));
		chars.put('p', getBannerMeta(DyeColor.BLACK, Arrays.asList(new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT))));
		chars.put('q', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT), new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP))));
		chars.put('r', getBannerMeta(DyeColor.BLACK, Arrays.asList(new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL_MIRROR), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT), new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP), new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE))));
		chars.put('s', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_TOP), new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.SQUARE_TOP_RIGHT), new Pattern(DyeColor.BLACK, PatternType.SQUARE_BOTTOM_LEFT), new Pattern(DyeColor.WHITE, PatternType.RHOMBUS_MIDDLE), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT))));
		chars.put('t', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_CENTER, PatternType.STRIPE_TOP)));
		chars.put('u', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_BOTTOM, PatternType.STRIPE_RIGHT, PatternType.STRIPE_LEFT)));
		chars.put('v', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT), new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNLEFT))));
		chars.put('w', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_BOTTOM), new Pattern(DyeColor.WHITE, PatternType.TRIANGLES_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT), new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT))));
		chars.put('x', getBannerMeta(DyeColor.WHITE, getPatterns(DyeColor.BLACK, PatternType.STRIPE_DOWNLEFT, PatternType.STRIPE_DOWNRIGHT)));
		chars.put('y', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNRIGHT), new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL_MIRROR), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNLEFT))));
		chars.put('z', getBannerMeta(DyeColor.WHITE, Arrays.asList(new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_TOP), new Pattern(DyeColor.BLACK, PatternType.TRIANGLE_BOTTOM), new Pattern(DyeColor.BLACK, PatternType.SQUARE_TOP_LEFT), new Pattern(DyeColor.BLACK, PatternType.SQUARE_BOTTOM_RIGHT), new Pattern(DyeColor.WHITE, PatternType.RHOMBUS_MIDDLE), new Pattern(DyeColor.BLACK, PatternType.STRIPE_DOWNLEFT))));
	}
	
	/**
	 * 
	 * @param color The generic color that will be used
	 * @param type The layers to be printed on the banner using the chosen color
	 * @return A copy of this banner
	 */
	public static List<Pattern> getPatterns(DyeColor color, PatternType... type) {
		List<Pattern> patterns = new ArrayList<Pattern>();
		for(int i = 0; i < type.length; i++)
			patterns.add(new Pattern(color, type[i]));
		return patterns;
	}
	
	/**
	 * 
	 * @param color The background color
	 * @param patterns The layers to be printed on the banner
	 * @return An {@link ItemStack} containing these parameters
	 */
	public static ItemStack getBanner(DyeColor color, List<Pattern> patterns) {
		ItemStack banner = new ItemStack(Material.BANNER);
		banner.setItemMeta(getBannerMeta(color, patterns));
		return banner;
	}
	
	/**
	 * 
	 * @param color The background color
	 * @param patterns The layers to be printed on the banner
	 * @return An ItemMeta containing these parameters
	 */
	public static BannerMeta getBannerMeta(DyeColor color, List<Pattern> patterns) {
		BannerMeta meta = (BannerMeta) new ItemStack(Material.BANNER).getItemMeta();
		meta.setBaseColor(color);
		meta.setPatterns(patterns);
		return meta;
	}
	
	/**
	 * 
	 * @param c The character to be printed
	 * @param background The background color
	 * @param color The font color
	 * @return A banner {@link ItemStack} with the corresponding character using a basic font system
	 */
	public static ItemStack getCharBanner(char c, DyeColor background, DyeColor color) {
		BannerMeta meta = chars.get(Character.toLowerCase(c));
		
		if(meta == null)
			throw new IllegalArgumentException("This character can't be reproduced on a banner !");
		
		List<Pattern> patterns = meta.getPatterns();
		
		patterns = clonePatterns(patterns);
		
		for(int i = 0; i < patterns.size(); i++) {
			DyeColor patternColor = patterns.get(i).getColor().equals(DyeColor.BLACK) ? color : background;
			patterns.set(i, new Pattern(patternColor, patterns.get(i).getPattern()));
		}
		
		return getBanner(meta.getBaseColor().equals(DyeColor.WHITE) ? background : color, patterns);
	}
	
	@Deprecated
	private static List<Pattern> clonePatterns(List<Pattern> list) {
		List<Pattern> newList = new ArrayList<Pattern>();
		for(Pattern pattern : list) {
			newList.add(pattern);
		}
		return newList;
	}
	
	private BannersUtils() {}
}
