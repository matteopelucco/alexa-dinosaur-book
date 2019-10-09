package com.pelucco.alexa.dinosaur;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.pelucco.alexa.dinosaur.handlers.*;
import com.amazon.ask.SkillStreamHandler;

public class DinosaurStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new FactIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallBackIntentHandler())
                // Add your skill id below and uncomment to enable skill ID verification
                // .withSkillId("")
                .build();
    }

    public DinosaurStreamHandler() {
        super(getSkill());
    }

}
