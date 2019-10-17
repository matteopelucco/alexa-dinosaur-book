package com.pelucco.alexa.dinosaur;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.pelucco.alexa.dinosaur.handlers.*;
import com.amazon.ask.SkillStreamHandler;

public class DinosaurStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                		new DinosaurDetailIntentHandler(),
                		new CancelandStopIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new CaptureNameIntent(),
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
