package com.nextbreakpoint.schema2git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Schema {
    private final String name;
    private final List<Table> tables = new ArrayList<>();
    private final Map<String, Table> tableMap = new HashMap<>();

    public Schema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTable(Table table) {
        tables.add(table);
        tableMap.put(table.getName(), table);
    }

    public Table getTable(String name) {
        return tableMap.get(name);
    }

    public Set<Table> getTables() {
        return new HashSet<>(tables);
    }
}
