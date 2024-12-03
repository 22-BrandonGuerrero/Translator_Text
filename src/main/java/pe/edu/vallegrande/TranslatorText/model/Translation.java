package pe.edu.vallegrande.TranslatorText.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("translations")
public class Translation {
    @Id
    private Long id;
    private String request_text;
    private String translated_text;
    private String from_lang;
    private String to_lang;
}
