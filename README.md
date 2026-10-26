# 2024 FRC robot development

A Java/WPILib robot project containing experimental swerve-drive calculations and controller-response code from 2024.

## Repository guide

- `src/main/java/frc/robot/Robot.java` — robot lifecycle.
- `src/main/java/frc/robot/RobotContainer.java` — command-based project wiring.
- `src/main/java/frc/robot/Systems/Swerve/` — swerve module and drivetrain experiments.
- `src/main/java/frc/robot/Systems/controlResponseSystem.java` — controller response logic.
- `vendordeps/` — checked-in vendor dependency definitions.
- `build.gradle` — GradleRIO build configuration.

## Development setup

Use a compatible WPILib development environment for the versions specified in `build.gradle` and `vendordeps/`.

From the repository root, try the Gradle wrapper:

```sh
./gradlew build
```

On Windows:

```powershell
.\gradlew.bat build
```

Build status is unverified. Robot operation requires the matching hardware and configuration.

## Project status

This repository contains development experiments and generated example classes. The vision class is a stub. Swerve calculations include TODOs and need review, simulation, and hardware validation before use. For example, the steering-angle calculation uses `atan(y / (x + epsilon))`, which does not distinguish all quadrants.

For a separate collection of team season source, see [FRC2594_2024](https://github.com/CodeOnWheels/FRC2594_2024).

## Attribution

WPILib-derived files retain their original notices. See [WPILib-License.md](WPILib-License.md).

