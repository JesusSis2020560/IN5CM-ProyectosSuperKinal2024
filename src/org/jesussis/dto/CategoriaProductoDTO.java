package org.jesussis.dto;

import org.jesussis.model.CategoriaProducto;

public class CategoriaProductoDTO {
    private static CategoriaProductoDTO instance;
    private CategoriaProducto categoriaProducto;
    
    private CategoriaProductoDTO(){
    
    }
    
    public static CategoriaProductoDTO getCategoriaProductoDTO(){
        if(instance == null){
            instance = new CategoriaProductoDTO();
        }
        return instance;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
}
