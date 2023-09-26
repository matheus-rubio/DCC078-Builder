package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoBuilderTest {

    @Test
    public void testBuildProduto() {
        Produto produto = new ProdutoBuilder()
                .setNome("Notebook")
                .setPreco(1500.0)
                .setDescricao("Notebook de última geração")
                .build();

        assertNotNull(produto);
        assertEquals("Notebook", produto.getNome());
        assertEquals(1500.0, produto.getPreco(), 0.001); // O terceiro argumento é a precisão para comparar valores
                                                         // double.
        assertEquals("Notebook de última geração", produto.getDescricao());
    }

    @Test
    public void testBuildProdutoSemNome() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProdutoBuilder()
                    .setPreco(1500.0)
                    .setDescricao("Notebook de última geração")
                    .build();
        });
    }

    @Test
    public void testBuildProdutoPrecoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProdutoBuilder()
                    .setNome("Notebook")
                    .setPreco(-1500.0)
                    .setDescricao("Notebook de última geração")
                    .build();
        });
    }

    @Test
    public void testBuildProdutoComDescricaoVazia() {
        Produto produto = new ProdutoBuilder()
                .setNome("Mouse")
                .setPreco(25.0)
                .setDescricao("")
                .build();

        assertNotNull(produto);
        assertEquals("Mouse", produto.getNome());
        assertEquals(25.0, produto.getPreco(), 0.001);
        assertEquals("", produto.getDescricao());
    }
}
