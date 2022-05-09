
package Clases;


public class Respuesta {
    private String muyBajo;
    private String bajo;
    private String medioBajo;
    private String  medioAlto;
    private String muyAlto;
    
    public Respuesta (){
    this.muyBajo = "<html><p>Con esta puntuación debes saber que todavía no conoces suficientemente qué emociones son las </p><br>" 
                   +"<p>que vives, no valoras adecuadamente tus capacidades, que seguramente tienes. Son muchas las </p><br>" 
                   +"<p>habilidades que no pones en práctica, y son necesarias para que te sientas más a gusto contigo </p><br>"
                   + "<p>mismo y para que las relaciones con la gente sean satisfactorias.</p><br></html>";
    
    this.bajo = "<html><p>Con esta puntuación tus habilidades emocionales son todavía escasas. Necesitas conocerte un  </p><br>" 
                   +"<p>poco mejor y valorar más lo que tú puedes ser capaz de hacer. Saber qué emociones </p><br>" 
                   +"<p>experimentas, cómo las controlas, cómo las expresas y como las identificas en los demás es </p><br>"
                   + "<p>fundamental para que te puedas sentir bien, y desarrollar toda tu personalidad de una manera </p><br>"
                   + "<p>eficaz.</p><br></html>";
    
    this.medioBajo = "<html><p>Casi lo conseguiste. Con esta puntuación te encuentras rayando lo deseable para tus habilidades </p><br>" 
                   +"<p>emocionales. Ya conoces muchas cosas de lo que piensas, haces y sientes y, posiblemente, de </p><br>" 
                   +"<p>cómo manejar tus emociones y comunicarte con eficacia con los demás. No obstante, no te </p><br>"
                   + "<p>conformes con este puntaje conseguido.</p><br></html>";
    
    this.medioAlto = "<html><p>No está nada mal la puntuación que has obtenido. Indica que sabes quién eres, cómo te </p><br>" 
                   +"<p>emocionas, cómo manejas tus sentimientos y cómo descubres todo esto en los demás. Tus </p><br>" 
                   +"<p>relaciones con la gente las llevas bajo control, empleando para ello tus habilidades para saber </p><br>"
                   + "<p>cómo te sientes tú, cómo debes expresarlo y también conociendo cómo se sienten los demás, y </p><br>"
                   + "<p>qué debes hacer para mantener relaciones satisfactorias con otras personas.</p><br></html>";
    
    this.muyAlto = "<html><p>Eres un superhéroe de la emoción y su control. Se diría que eres número 1 en eso de la </p><br>" 
                   +"<p>INTELIENCIA EMOCIONAL. Tus habilidades te permiten ser consciente de quién eres, qué</p><br>" 
                   +"<p>objetivos pretendes, qué emociones vives, sabes valorarte como te mereces,  </p><br>"
                   + "<p> manejas bien tus estados emocionales y, además, con más mérito todavía, eres capaz </p><br>"
                   + "<p>de comunicarte eficazmente con quienes te rodean, y también eres único/a  </p><br>"
                   + "<p>para solucionar posconflictos interpersonales que cada día acontecen.<p><br></html>";          
    }

    public String getMuyBajo() {
        return muyBajo;
    }

    public String getBajo() {
        return bajo;
    }

    public String getMedioBajo() {
        return medioBajo;
    }

    public String getMedioAlto() {
        return medioAlto;
    }

    public String getMuyAlto() {
        return muyAlto;
    }
    
    
    
}
