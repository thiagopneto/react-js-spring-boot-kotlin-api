package br.com.erudio.integrationtests.vo.wrappers

import br.com.erudio.integrationtests.vo.BookVO
import com.fasterxml.jackson.annotation.JsonProperty

class BookEmbeddedVO {

    @JsonProperty("bookVOes")
    var books: List<BookVO>? = null
}