/*
 * Copyright 2016 Jovem Exemplar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.edu.ifrn.biblioteka.dominio;

import java.util.Comparator;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ivanilson
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exemplar implements Comparable<Exemplar> {
    
    private Livro livro;

    private Date dataDeCompra;
    
    private boolean emprestado;
    

    @Override
    public int compareTo(Exemplar e) {
        int status;
        
        status = this.livro.compareTo(e.livro);
        
        if (status == 0) {
            status = this.dataDeCompra.compareTo(e.dataDeCompra);
        }
        
        if (status == 0) {
            if (this.emprestado != e.emprestado) {
                status = -1;
            }
        }
        
        return status;
    }
    
}
