package com.dk0124.html_to_md_converter.openai;

import java.util.List;

public interface ContentSplitter {

    List<String> splitContent(String content, int size);

}
