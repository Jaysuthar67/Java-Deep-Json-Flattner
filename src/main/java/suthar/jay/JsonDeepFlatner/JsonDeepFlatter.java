/*
 * Copyright (c) 2022 Jay Suthar - All rights reserved.
 */

package suthar.jay.JsonDeepFlatner;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonDeepFlatter {
    private JSONObject ROOT;
    private HashMap<String, String> flattenFormatMap;

    public JsonDeepFlatter() {

    }

    public JsonDeepFlatter(HashMap<String, String> flattenFormatMap, JSONObject JsonToFlatten) {
        this.ROOT = JsonToFlatten;
        this.flattenFormatMap = flattenFormatMap;
    }


    /**
     * <b>Need to initialize with Constructor</b>
     *
     * @return flattened Map&lt;String,Object&gt; is specified format in
     * @throws RuntimeException
     * @throws org.json.JSONException
     */
    public Map<String, Object> DeepFlatten() {
        Map<String, Object> flattenedHashMap = new HashMap<>();

        return flattenedHashMap;
    }

    /**
     * @param flattenFormatMap
     * @param JsonToFlatten
     * @return flattened Map&lt;String,Object&gt; is specified format in
     * @throws RuntimeException
     * @throws org.json.JSONException
     */
    public Map<String, Object> DeepFlatten(HashMap<String, String> flattenFormatMap, JSONObject JsonToFlatten) {
        Map<String, Object> flattenedHashMap = new HashMap<>();
        this.ROOT = JsonToFlatten;
        this.flattenFormatMap = flattenFormatMap;
        return flattenedHashMap;
    }

}
