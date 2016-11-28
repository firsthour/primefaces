/*
 * Copyright 2009-2017 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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
package org.primefaces.component.datatable;

import java.io.Serializable;
import java.util.List;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

public class TableState implements Serializable {
 
    private int first;
    
    private int rows;
    
    private List<SortMeta> multiSortMeta;
    
    private ValueExpression sortBy;
    
    private String sortOrder;
    
    private String sortField;
    
    private MethodExpression sortFunction;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public List<SortMeta> getMultiSortMeta() {
        return multiSortMeta;
    }

    public void setMultiSortMeta(List<SortMeta> multiSortMeta) {
        this.multiSortMeta = multiSortMeta;
    }

    public ValueExpression getSortBy() {
        return sortBy;
    }

    public void setSortBy(ValueExpression sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public MethodExpression getSortFunction() {
        return sortFunction;
    }

    public void setSortFunction(MethodExpression sortFunction) {
        this.sortFunction = sortFunction;
    }
    
    
}